<%--
  Created by IntelliJ IDEA.
  User: ARHAM
  Date: 9/22/2016
  Time: 4:14 PM
  --%>
<div class="section">
    <div class="container" ng-controller="AdvertiserController as adctrl">
        <div class="row">
            <div class="col-md-9" style="text-align: left">
                <div class="panel panel-info" >
                    <div class="panel-heading" style="height: 50px"><h4>Assigning New Advertisements</h4></div>
                    <div class="panel-body contact-form-box">
                        <form role="form" name="advertiseForm" >
                            <div class="form-group">
                                <label class="control-label" name="category">Select Category :</label>
                                <select class="form-control" ng-modal="advertise.category">
                                    <option>Fashion</option>
                                    <option>Food</option>
                                    <option>Education</option>
                                    <option>Entertainment</option>
                                    <option>Item 5</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label class="control-label" >Advertisement Heading :</label>
                                <input class="form-control" name="heading" type="text" ng-modal="advertise.heading">
                            </div>
                            <div class="form-group">
                                <label class="control-label" >Select Image :</label>
                                <input name="image" type="file">
                            </div>
                            <div class="form-group">
                                <label class="control-label" >URL of Advertise :</label>
                                <input class="form-control" name="aurl" type="text" ng-modal="advertise.adurl">
                            </div>
                            <div class="form-group">
                                <label class="control-label" >Description about advertise :</label>
                                <textarea class="form-control" name="description" type="text" ng-modal="adctrl.advertise.description" style="height: 100px"></textarea>
                            </div>
                            <div class="form-group">
                                <label class="control-label" >Time Period for Avdertisement :</label>
                                <select class="form-control" ng-modal="advertise.time">
                                    <option>For 2 Weeks</option>
                                    <option>For 1 Month</option>
                                    <option>For 3 Month</option>
                                    <option>For 6 Month</option>
                                    <option>For 1 Year</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label class="control-label" >Place to Display Add :</label>
                                <select class="form-control" ng-modal="advertise.place">
                                    <option>Top of Left Side</option>
                                    <option>middle of Left Side</option>
                                    <option>Bottom of Left Side</option>
                                    <option>Bottom of Page</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label class="control-label" >Payment for Advertisement :</label>
                                <%--<input class="form-control" type="text">--%>
                                <label class="control-label" ng-modal="advertise.payment" />
                            </div>

                            <input type="submit" class="btn btn-success" ng-click="adctrl.submit()" value="Upload to Administrator" />
                            <button type="button" ng-click="adctrl.reset()"  class="btn btn-warning" >Reset Form</button>
                        </form>
                        <button type="button" ng-click="adctrl.test()"  class="btn btn-warning" >Test Form</button>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>



<script type="text/javascript" src="/static/js/lib/angular-1.4.4.js"></script>
<script type="text/javascript" src="/static/js/lib/angular-route.min.js"></script>
<script type="text/javascript" src="/static/js/app.js"></script>
<script type="text/javascript" src="/static/js/controller/advertiser_controller.js"></script>
<%--<script type="text/javascript" src="/static/js/service/user_service.js"></script>--%>
<script type="text/javascript" src="/static/js/service/advertiser_service.js"></script>
