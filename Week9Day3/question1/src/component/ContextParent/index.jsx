import React, { useContext } from 'react'
import { ToggleContext } from '../../context/ToggleContext';
import ContextButton from '../ContextButton';

export default function ContextParent() {
  const {toggleValue} = useContext(ToggleContext);
  const {arr, index} = toggleValue;
      
  return (
    <div>
        <h1>{arr[index]}</h1>
        <ContextButton></ContextButton>
    </div>
  )
}
