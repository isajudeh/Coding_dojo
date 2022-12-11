// rafce
import React from 'react'

const PersonCards = (props) => {
  return (
    <div>
    <div>
      <h1>{props.firstName},{props.lastName}</h1>
      <p>Age: {props.age}</p>
      <p>Hair Color: {props.hairColor}</p>
    </div>
    <div>
      <h1>{props.firstName1},{props.lastName1}</h1>
      <p>Age: {props.age1}</p>
      <p>Hair Color: {props.hairColor1}</p>
    </div>
    </div>
  )
}

export default PersonCards
