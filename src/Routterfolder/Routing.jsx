import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "../components/Home";
import Aboutus from "../components/Aboutus";

const Routing=()=>{

    return(
        <div>
   
   <Routes>
    <Route path='/' element={<Home/>}></Route>
    <Route path='/aboutus' element={<Aboutus/>}></Route>
   </Routes>
  
        </div>
    )
}
export default Routing;