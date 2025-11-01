import { Component } from "react"
import { HeaderSection } from "./HeaderSection"

export class Home extends Component{
    render(){
        return(
            <div>
                <h2>Welcome to home page</h2>
                <p>This is home page</p>
                <HeaderSection
                    heading="Hello Header"
                    para="this is header section para"
                    button="Submit"
                    age={15}
                />
                 <HeaderSection
                    heading="Hello Header"
                    para="this is header section para"
                    button="Submit"
                    linkText="Visit"
                    link="https://google.com"
                    age={25}
                />

            </div>
        )
    }
}

