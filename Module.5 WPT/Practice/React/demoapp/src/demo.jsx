import { Component } from "react";
import { Register } from "./Register";
import {Login} from "./login";

export class Demo extends Component{
    render(){
    return(
        <div>
           <h1>Hello React</h1>
           <Login></Login>
           <Register/>
        </div>
    )
 }
}