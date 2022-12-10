import './App.css'; 
import List from './components/List';
import PersonCard from './components/PersonCard';


function App() {
  return (
    <div className="App">
      <List/>
      <PersonCard firstName="ZOZO" lastName="DODO" age= {31} hairColor="Black"
                  firstName1="LOLO" lastName1="SOSO" age1= {21} hairColor1="Black"
                  firstName2="JOJO" lastName2="KOKO" age2= {11} hairColor2="Black"
                  firstName3="FOFO" lastName3="MOMO" age3= {41} hairColor3="Black"/>
    </div>
  );
}

export default App;