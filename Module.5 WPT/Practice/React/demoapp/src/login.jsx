import { Component } from "react";

export class Login extends Component{
    render(){
        return(
            <div>
                <input type="text" placeholder="Enter username"/>
                <br/>
                <input type="password" placeholder="Enter Passowrd"/>
                <br/>
                <input type="submit" value="Login"/>
            </div>
        )
    }
}