import './App.css';
import Parent from './component/Parent';
import React, {useState} from 'react';
import { ToggleContext, ToggleValue } from './context/ToggleContext';
import ContextParent from './component/ContextParent';

function App() {
  const [toggleValue, setToggleValue] = useState<ToggleValue>({ arr: ["Java", "JavaScript"], index: 0 } as ToggleValue);

  return (
    <div className="App">
      {/* Use props to update with child component */}
      <Parent></Parent>
      
      {/* Use context to update main page */}
      <ToggleContext.Provider value={{toggleValue, setToggleValue}}>
        <ContextParent></ContextParent>
      </ToggleContext.Provider>
    </div>
  );
}

export default App;
