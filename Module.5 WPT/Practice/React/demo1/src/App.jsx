import {Home} from './Home'
import {HeaderContent} from "./HeaderContent"


function App() {
  return(
    <div>
        <h1>Hello Demo App</h1>
        <Home/>
      <HeaderContent
       heading = "This is Header Content"
       intro= "This is header content intro"
       button = "Submit"
       />
       <HeaderContent
       heading = "This is Header Content 2"
       intro= "This is header content intro"
       button = "Click me"
       linkText = "Link"
       link = "https://google.com"
       />
    </div>
  )
}

export default App