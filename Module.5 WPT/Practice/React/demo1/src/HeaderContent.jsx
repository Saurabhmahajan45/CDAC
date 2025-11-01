import { Component } from "react";

export class HeaderContent extends Component{
    render(){
        return(
            <div>
                <h1>{this.props.heading}</h1>
                <p>{this.props.intro}</p>
                <button>{this.props.button}</button>
                {
                    this.props.link ? <a href ={this.props.link}>{this.props.linkText}</a>: null
                }
            </div>
        )
    }
}