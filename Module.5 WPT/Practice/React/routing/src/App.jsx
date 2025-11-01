import { BrowserRouter } from "react-router-dom"
import { Navbar } from "./Compenents/Navbar"
import { AppRouter } from "./Compenents/AppRouter"

function App(){
  return(
    <BrowserRouter>
    <div>
      <Navbar/>
      <AppRouter/>
    </div>
    </BrowserRouter>
     
  )
}

export default App 