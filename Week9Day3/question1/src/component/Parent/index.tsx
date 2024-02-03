import React, { useState } from 'react'
import ToggleButton from '../ToggleButton';

export default function Parent() {
  const arr = ["JavaScript", "Java"];
  const [index, setIndex] = useState<number>(0);
  
  return (
    <div>
        <h1>{arr[index]}</h1>
        <ToggleButton 
            index={index}
            setIndex={setIndex}
            arr={arr}
        ></ToggleButton>
    </div>
  )
}
