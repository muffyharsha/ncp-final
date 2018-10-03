
$(document).ready(function(){

 var id = localStorage.getItem("id");

 $.get("https://harsha555.pythonanywhere.com/work_details", 
 {
    id: id
    

 }
,function(data, status){
    var myJSON = JSON.parse(data);
    console.log(myJSON);
    $("#name").text(myJSON.name);
    $("#emp_id").text(id);
    $("#role").text(myJSON.role);
    $("#manager").text(myJSON.manager);
    $("#prog_manager").text(myJSON.programmanager);
    $("#assignment_leader").text(myJSON.assignmentleader);
    $("#office_location").text(myJSON.officelocation);
    $("#desk_number").text(myJSON.desknumber);
    $("#current_project").text(myJSON.currentproject);
});

});