import {React,useState} from 'react'


const Registrationform=()=>{
     const [firstname,setFirstName]=useState('');
     const[lastname,setLastname]=useState('');
     const[email,setEmail]=useState('');
     const[checkpassword,setCheckpassword]=useState('');
    const [correctpass,setCorrectpass]=useState(true);
      const [password,setPassword]=useState('');

      const handlesubmit=(e)=>{

        if(password===checkpassword){
            setCorrectpass(true);
            
          
           e.preventdefaultvalue();
           alert(`successfully registered`);

           setFirstName('');
           setLastname('');
           setEmail('');
           setCheckpassword('');
           setPassword('');
          
        }
        else{
            setCorrectpass(false);
            setCheckpassword('');
          }
          
      }

      

      return(
       <div>
        <h2>Registration form</h2>
        <form onSubmit={handlesubmit}>
            <div>
                <label>FirstName</label>
                <input
                type='text'
                value={firstname}
                onChange={(e)=> setFirstName(e.target.value)}
                required
                />
                </div>
            <div>
                <label>LastName</label>
                <input
                type='text'
                value={lastname}
                onChange={(e)=> setLastname(e.target.value)}
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
                <label>Confirm Password</label>
                <input
                type='password'
                value={checkpassword}
                onChange={(e)=> setCheckpassword(e.target.value)}
              
                required
                />
                
                { correctpass?
                (<p></p>):
                (<p style={{color:"red",fontSize:"10px"}}>*incorrect password</p>)

                }
                
            </div>
            <div>
                <label>Email</label>
                <input
                type='email'
                value={email}   
                onChange={(e)=> setEmail(e.target.value)}
                required
                />
                </div>
           
            <div>
               <button onClick={handlesubmit}>Register</button>
            </div>
        </form>
       </div>
      )
    }
export default Registrationform;
   