//document.ready(function(){

    var rootRef = firebase.database().ref().child("userdata");

    rootRef.on("child_added", snap => {

        var name = snap.child("uname").val();
        var standnumber = snap.child("standNumber").val();
        var pnumber = snap.child("phoneNumber").val();
        var meternumber = snap.child("meterNumber").val();
        var allocdate = snap.child("allocDate").val();
        var standarea = snap.child("standArea").val();
        var id = snap.child("uid").val();
        var location =snap.child("location").val();
        var payment_status = snap.child("payment_status").val();
        var sewer_status = snap.child("sewer_status").val();
        var road_status = snap.child("road_status").val();
        var water_status = snap.child("water_status").val();
        
    

        $("#table_body").append("<tr> <td>"
        
        + name +"</td> <td>"
        + standarea + "</td> <td>"
        + standnumber +"</td> <td>" 
        + allocdate +"</td> <td>"
        + meternumber +"</td> <td>"
        + pnumber + "</td> <td>"
        + location +"</td>  </tr>");

        $("#detailed").append("<tr> <td>"

        + name + "</td> <td>" 
        + sewer_status + "</td> <td>" 
        + payment_status + "</td> <td>"
        + road_status + "</td> <td>"
        + water_status + "</td>  </tr>");


    }); 

//});