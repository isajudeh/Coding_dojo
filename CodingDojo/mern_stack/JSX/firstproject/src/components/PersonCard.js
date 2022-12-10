import React, { Component } from 'react';

class PersonCard extends Component {
  render() {
    const {firstName, lastName, age, hairColor,
           firstName1, lastName1, age1, hairColor1,
           firstName2, lastName2, age2, hairColor2,
           firstName3, lastName3, age3, hairColor3} = this.props;
    return (
    <div>
        <div>
        <h1>{firstName}, {lastName}</h1>
        <p>Age: {age}</p>
        <p>Hair Color: {hairColor}</p>
        </div>
        <div>
        <h1>{firstName1}, {lastName1}</h1>
        <p>Age: {age1}</p>
        <p>Hair Color: {hairColor1}</p>
        </div>
        <div>
        <h1>{firstName2}, {lastName2}</h1>
        <p>Age: {age2}</p>
        <p>Hair Color: {hairColor2}</p>
        </div>
        <div>
        <h1>{firstName3}, {lastName3}</h1>
        <p>Age: {age3}</p>
        <p>Hair Color: {hairColor3}</p>
        </div>
    </div>
    );
  }
}

export default PersonCard;