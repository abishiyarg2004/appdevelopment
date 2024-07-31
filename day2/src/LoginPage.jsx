import {React,useState} from 'react'

const LoginPage=()=>{

    const [username,setUsername]=useState('');
    const [password,setPassword]=useState('');

    const handlesubmit=(e)=>{
         e.preventdefaultvalue();
         alert(`Login successfully`)
         setUsername('');
         setPassword('');
    }

    return(
     <div >
      <h2>Login </h2>
      <form onSubmit={handlesubmit}>
          <div>
              <label>Username</label>
              <input
              type='email'
              value={username}
              onChange={(e)=> setUsername(e.target.value)}
              required
              />
              </div>
              <div>
              <label>Password</label>
              <input
              type='password'
              value={password}
              onChange={(e)=>setPassword(e.target.value)}
              required
              />
          </div>
          <div>
             <button>Login</button>
          </div>
      </form>
     </div>
    )



}
export default LoginPage;