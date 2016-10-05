<%--
  Created by IntelliJ IDEA.
  User: ARHAM
  Date: 9/22/2016
  Time: 5:20 PM
  To change this template use File | Settings | File Templates.
--%>


<div class="col-md-9" style="text-align: left">
    <div class="panel panel-info" >
        <div class="panel-heading" style="height: 50px"><h4>Manage Profile</h4></div>
        <div class="panel-body">

            <form role="form" class="form-group">
                <div class="col-md-9">
                    <label name="category" class="col-md-6">Name :</label>
                    <input type="text" class="form-control"/>
                </div>

                <div class="col-md-6 form-group" >
                    <label> Advertisement Heading :</label>
                    <input type="text" class="form-control"/>
                </div>

                <div class="col-md-9 form-group">
                    <label> Enter something :</label>
                    <input  type="text" class="form-control"/>
                </div>

                <div class="form-group">
                    <label class="sr-only" for="form-first-name">First name</label>
                    <input type="text" name="form-first-name" placeholder="First name..." class="form-first-name form-control" id="form-first-name">
                </div>
                <div class="form-group">
                    <label class="sr-only" for="form-last-name">Last name</label>
                    <input type="text" name="form-last-name" placeholder="Last name..." class="form-last-name form-control" id="form-last-name">
                </div>
                <div class="form-group">
                    <label class="sr-only" for="form-email">Email</label>
                    <input type="text" name="form-email" placeholder="Email..." class="form-email form-control" id="form-email">
                </div>
                <div class="form-group">
                    <label class="sr-only" for="form-about-yourself">About yourself</label>
                    <textarea name="form-about-yourself" placeholder="About yourself..."
                              class="form-about-yourself form-control" id="form-about-yourself"></textarea>
                </div>
                <button type="submit" class="btn">Sign me up!</button>

                </form>
            </div>
        </div>
    </div>

