
import './App.css';
import Registrationform from './Registrationform.jsx'
import { useState } from 'react';
import LoginPage from './LoginPage.jsx';

function App() {
  const [log,setLog]=useState(false);
  
  return (
    // <div className="App">
    //   <header className="App-header">
    //      <button onClick={()=>setLog(!log)}>

    //       {
    //         log? 'Switch to Register' : 'Switch to Login'
    //       }
    //      </button>
        
    //       {
    //         log ? (
    //           <LoginPage></LoginPage>
    //         )
    //         :
    //         (<Registrationform></Registrationform>)
    //       }
    //   </header>
    // </div>

    <div>
      
    </div>
  );
}

export default App;
