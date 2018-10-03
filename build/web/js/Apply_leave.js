$(document).ready(function(){
    $("#submit").click(function(){
        var comm = $("#comment").val();
        
        var isValid = true;
        if (comm == ""){
            alert("Please enter Reason");
            isValid = false;
        }


    var id = localStorage.getItem("id");

    if (isValid){
           
        $.get("http://localhost:8080/ncp/apply_leave", 
          {
            id: id,
            StartDate:$("#start").val(),
            EndDate:$("#end").val(),
            Reason:$("#comment").val()

          }
        ,function(data, status){
            alert(data);
        });
    }
   
    /*$.get("https://harsha555.pythonanywhere.com/apply_leave", 
    {

        id: id,
        StartDate:$("#start").val(),
        EndDate:$("#end").val(),
        Reason:$("#comment").val()
       
    }
   ,function(data, status){
       var myJSON = JSON.parse(data);
       console.log(myJSON);
       $("#start").text(myJSON.StartDate);
       $("#end").text(myJSON.EndDate);
       $("#comment").text(myJSON.Reason);*/
      
      
   });
});

