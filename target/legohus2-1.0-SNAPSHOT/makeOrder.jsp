<%-- 
    Document   : makeOrder
    Created on : 21-03-2019, 12:52:27
    Author     : Kasper Jeppesen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script type="text/javascript">
    
    function doorAndWindowValidate()
    {
        var length = Integer.Parseint(document.getElementsByName("length"));
        var height = Integer.Parseint(document.getElementsByName("height"));
        
        var checkboxDoor = document.getElementsByName("door");
        var checkboxWindow = document.getElementsByName("Window");

        if(checkboxDoor == true || checkboxWindow == true)
        {
            if(length < 9 || height < 4)
            {
                alert("The length need to be atleast 9 and the height atleast 4, in order to get a door or window")
            }
        }
    }
    
</script>

<form onsubmit="return doorAndWindowValidate()" action="FrontController" method="get">
    <p>Enter the width of the house</p> 
    <input type="text" name="width"> <br>

    <p>Enter the length of the house</p> 
    <input type="text" name="length"> <br>
    
    <p>Enter the height of the house</p> 
    <input type="text" name="height"> <br>
    
    <p> check the boxes down below if you want a door or a window </p>
    <p> Please note that the length of the house need to be atleast 8, and the height of the house atleast 4, in order to get a door and a window</p> <br>
    
    <label for="door"> Door: </label>
    <input type="checkbox" name="door" onclick="doorAndWindowValidate()"> <br> <br>
    <label for="door"> Window: </label>
    <input type="checkbox" name="window" onclick="doorAndWindowValidate()"> <br> <br>

    <input type="submit" name="place order">
    <input type="hidden" name="command" value="makeOrder">
</form>



