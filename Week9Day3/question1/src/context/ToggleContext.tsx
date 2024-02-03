import React, { createContext, useContext } from 'react';

// 创建一个 Context 对象
export const ToggleContext = createContext({} as ToggleContextType);

export interface ToggleValue {
    arr: string[];
    index: number;
}

export interface ToggleContextType {
    toggleValue: ToggleValue;
    setToggleValue: React.Dispatch<React.SetStateAction<ToggleValue>>;
}