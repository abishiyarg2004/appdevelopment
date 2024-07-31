import logo from './logo.svg';
import './App.css';
import Navigationbar from './components/Navigationbar';
import Routing from './Routterfolder/Routing';
import { BrowserRouter } from 'react-router-dom';

function App() {
  return (
    <BrowserRouter>
    <div >
      <Navigationbar></Navigationbar>
       
    <Routing></Routing>
    </div>
    </BrowserRouter>
  );
}

export default App;
