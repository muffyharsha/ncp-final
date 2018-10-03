<%-- 
    Document   : Apply_leave
    Created on : 3 Oct, 2018, 7:17:33 PM
    Author     : harsha
--%>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<link rel="stylesheet" href="css/apply_leave.css">

        <div class = "box d-flex justify-content-center">
            
          <div class="card">
                <span class="card-header",background-color:rgba(0,255,0,0.3)>Leave Form</span>
             <div class="card-body">
               
             <div class = "input-box flex-col">
                 <label for class="start">Start Date</label>
                 <input type="date" class="form-control" id="start"  placeholder="Start Date">

                 <label for class="end">End Date</label>
                 <input type="date" class="form-control" id="end"  placeholder="End Date">

                 <br>
                 <label for class="comment">Reason</label>
                 <textarea class="form-control" rows="5" id="comment" ></textarea>
                 <button type="submit" id="submit" class="btn btn-primary form-control">Submit</button>

             </div>
     
             
             </div>
            </div>
        </div>

        <script src="js/Apply_leave.js"></script> 

      
    