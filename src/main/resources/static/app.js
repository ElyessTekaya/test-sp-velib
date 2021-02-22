var stompClient = null;

function setConnected(connected) {
  $("#connect").prop("disabled", connected);
  $("#send").prop("disabled", !connected);
  $("#disconnect").prop("disabled", !connected);
  if (connected) {
    $("#content").show();
    $("#send").prop("disabled", false);
    $("#myform")[0].reset();
  } else {
    $("#content").hide();
    $("#send").prop("disabled", true);
    $("#myform")[0].reset();
  }
  $("#elements").html("");
}

function connect() {
  var socket = new SockJS("/websocket");
  stompClient = Stomp.over(socket);
  stompClient.connect({}, function (frame) {
    setConnected(true);
    stompClient.subscribe("/topic/elements", function (elements) {
      showElements(JSON.parse(elements.body));
    });
  });
}

function disconnect() {
  if (stompClient !== null) {
    stompClient.disconnect();
  }
  setConnected(false);
}

function sendName() {
  console.log($("#q").val());
  if ($("#q").val() !== "") {
    stompClient.send(
      "/app/get",
      {},
      JSON.stringify({
        dataset: "velib-disponibilite-en-temps-reel",
        q: $("#q").val(),
        row: $("#row").val(),
        start: $("#start").val(),
      })
    );
  }
}

function showElements(message) {
  $("#elements").html("");
  $("#elements").append(
    "<center><thead> <tr><th>" +
      "Nombre de stations  :  " +
      message.nhits +
      "</th> </tr></thead><center>"
  );
  var nbr = 0;
  var nbrmeca = 0;
  var nbrelec = 0;
  let result = message.records;
  for (var i in result) {
    nbr = nbr + result[i]["fields"].numbikesavailable;
    nbrmeca = nbrmeca + result[i]["fields"].mechanical;
    nbrelec = nbrelec + result[i]["fields"].ebike;
    var dateLastRecord = result[i]["record_timestamp"];

    var date = new Date(dateLastRecord).toLocaleDateString("fr-FR");
    var minutes = new Date(dateLastRecord).getUTCMinutes();
    var hours = new Date(dateLastRecord).getUTCHours();

    $("#elements").append(
      "<tr><td>" +
        result[i]["fields"].name +
        "</td><td>Mise à jour du " +
        date +
        " à " +
        hours +
        ":" +
        minutes +
        "</td></tr>"
    );
  }
  $("#elements").append(
    "<tr><td>" +
      "Vélos disponible" +
      "</td><td>" +
      nbr +
      "</td>" +
      "<td>" +
      "(Mécanique)" +
      "</td><td>" +
      nbrmeca +
      "</td>" +
      "<td>" +
      "(Eléctrique)" +
      "</td><td>" +
      nbrelec +
      "</td>" +
      "</tr>"
  );
}

$(function () {
  $("form").on("submit", function (e) {
    e.preventDefault();
  });
  $("#connect").click(function () {
    connect();
  });
  $("#disconnect").click(function () {
    disconnect();
  });
  $("#send").click(function () {
    sendName();
  });
});
