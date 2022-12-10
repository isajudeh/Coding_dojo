import './App.css'; 
import List from './components/List';
import PersonCard from './components/PersonCard';


function App() {
  return (
    <div className="App">
      <List/>
      <PersonCard firstName="ISA" lastName="Judeh" age= {31} hairColor="Black" />
    </div>
  );
}

export default App;