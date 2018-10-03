$(document).ready(function(){
   // $("button").click(function(){
    var id = localStorage.getItem("id");

    $.get("http://localhost:8080/ncp/leavehistory", 
    {
       id: id
       
    }
   ,function(data, status){
    var myJSON = JSON.parse(data);
    for (var i = 0, len = myJSON.length; i < len; i++) {
        console.log(data[i]);
        $("#sdate").append(myJSON[i].start_date);
       $("#edate").append(myJSON[i].end_date);
       $("#reason").append(myJSON[i].reason);
    }
       /*
       $("#sdate").text(myJSON[0].start_date);
       $("#edate").text(myJSON[0].end_date);
       $("#reason").text(myJSON[0].reason);*/
      
   });   
       /*var number_of_rows = myJSON.length;
       //var k=0;
       var table_body= '<table class="table"><thead><tr><th>S.NO</th><th>APPLIED FROM</th><th>APPLIED TILL</th><th>REASON FOR LEAVE</th></tr></tbody></table>';
       //console.log(table_body);
       for(j in number_of_rows){
        table_body+='<tr>';

        table_body +='<td>';
        table_body +=myJSON[j].start_date;
        table_body +='</td>';

       
        table_body +='<td>';
        table_body +=myJSON[j].end_date;
        table_body +='</td>';

        table_body +='<td>';
        table_body +=myJSON[j].reason;
        table_body +='</td>';
    
        table_body+='</tr>';
       }
       table_body+='</tbody></table>';

       $('#tableDiv').html(table_body);
       //display data..........*/
     //});

   
   });

