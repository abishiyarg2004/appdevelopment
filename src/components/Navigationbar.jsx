import { useNavigate } from "react-router-dom";

const Navigationbar=()=>{
   const navigate=useNavigate();
   
    return(
        <div style={{height:"70px", backgroundColor:"black"}}>
             <button onClick={()=> {navigate('/')}} >Home</button>
             <button onClick={()=>{navigate('/aboutus')}} >About us</button>
        </div>
    )
}
export default Navigationbar;