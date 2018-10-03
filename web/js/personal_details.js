
$(document).ready(function(){

    var id = localStorage.getItem("id");
   
    $.get("https://localhost:8080/ncp/personal_details", 
    {
       id: id
       
    }
   ,function(data, status){
       var myJSON = JSON.parse(data);
       console.log(myJSON);
       $("#pname").text(myJSON.employee_name);
       $("#pdob").text(myJSON.dob);
       $("#bloodgroup").text(myJSON.blood_group);
       $("#address").text(myJSON.address);
       $("#mobile_number").text(myJSON.mobile_number);
       $("#emergency_number").text(myJSON.emergency_number);
       $("#pan_number").text(myJSON.pan_number);
      
   });
   
   });