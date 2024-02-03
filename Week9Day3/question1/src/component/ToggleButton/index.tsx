import React from 'react'

interface ButtonProps {
    arr: string[];
    index: number;
    setIndex: React.Dispatch<React.SetStateAction<number>>;
}

export default function ToggleButton(props: ButtonProps) {
  const {setIndex} = props;
  
  const onClick = () => setIndex(prevIndex => prevIndex == 0 ? 1 : 0);

  return (
    <button onClick={onClick}>Change Language</button>
  )
}
