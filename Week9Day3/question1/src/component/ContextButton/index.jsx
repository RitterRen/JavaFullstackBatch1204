import React, {useContext} from 'react'
import { ToggleContext } from '../../context/ToggleContext';

export default function ContextButton() {
  const {toggleValue, setToggleValue} = useContext(ToggleContext);
  const {arr, index} = toggleValue;

  const onClick = () => setToggleValue(prevToggleValue => {
    return {
        index: prevToggleValue.index == 0 ? 1 : 0,
        arr: prevToggleValue.arr
    }
  })
    
  return (
    <button onClick={onClick}>Change The Language</button>
  )
}
