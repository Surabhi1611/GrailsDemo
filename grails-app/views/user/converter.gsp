<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Currency Conversion</title>
</head>

<body>
<div class="panel-body">
<!--Form Opening-->
    <g:form class="form-horizontal" id="currencyConversion" controller="user" action="convert">
        <div class="form-group">
            <label class="control-label col-sm-4">Enter Dirham:</label>

            <div class="col-sm-6">
                <g:textField name="amount" id="amount" type="text" class="form-control"></g:textField>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-4">Select Currency:</label>

            <div class="dropdown col-sm-6">

                <g:select id="toCurrency" name="toCurrency" from="${list}"
                          noSelection="['': '-Select Currency-']"
                          class="dropdown dropdown-toggle btn btn-default col-sm-6"
                          data-toggle="dropdown" style="display:inline-block; width: 130px">
                    <div class="caret"></div>
                </g:select>

            </div>
        </div>
        <div>
            <g:submitButton value="Submit" action="convert" name="Submit" class="btn btn-default"
                            style="float:right; background-color:#d2d4d9"></g:submitButton>
        </div>

    </g:form>
<!--Form Closing-->
</div>


<script type="text/javascript">
    $(document).ready(function () {
        $('#currencyConversion').click(function (e) {
            e.preventDefault();
            var amount = jQuery("#amount").val();
            var datato = jQuery("#toCurrency").val();
            jQuery.ajax({
                url: "user/convert",
                data: {from: amount, to: datato}
            });
        });
    });
</script>


%{--<script type="text/javascript">
    $(document).ready(function () {
        $('[name="Submit"]').click(function (e) {
            e.preventDefault();
            var amount = jQuery("#amount").val();
            var datato = jQuery("#toCurrency").val();
          /*  $.ajax({
                url: "https://xecdapi.xe.com/v1/convert_to.json/?to=USD&from=CAD&amount=1000.00",
                dataType: 'json',
                beforeSend: function (xhr) {
                    xhr.setRequestHeader("Authorization", "Basic " + btoa("tothenew861870114" + ":" + "1cga0vjl6v7phr69rog27lmoqv"));
                },

                success: function (data) {
                    // success handler
                    console.log("Ajax Done");
                    console.log(data);
                }, error: function () {
                    // error handler
                    console.log("Ajax Break");
                }
            });*/
        });
    });

</script>--}%

</body>
</html>