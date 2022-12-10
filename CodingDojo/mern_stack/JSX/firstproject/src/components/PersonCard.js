import React, { Component } from 'react';

class PersonCard extends Component {
  constructor (props){
    super(props);
        this.state={
            age:this.props.age,
            age1:this.props.age1,
        }
    }
    offlight=(e) => { 
      this.setState({age:this.state.age+1});
  }
  offlight1=(y) => { 
    this.setState({age1:this.state.age1+1});
}
  render() {
    const {firstName, lastName, hairColor,
           firstName1, lastName1, hairColor1,
           firstName2, lastName2, age2, hairColor2,
           firstName3, lastName3, age3, hairColor3}=this.props;
    return (
    <div>

        <div>
        <h1>{firstName}, {lastName}</h1>
        <p>Age: {this.state.age}</p>
        <p>Hair Color: {hairColor}</p>
        <button onClick={this.offlight}>Click Me</button>

        </div>
        <div>
        <h1>{firstName1}, {lastName1}</h1>
        <p>Age: {this.state.age1}</p>
        <p>Hair Color: {hairColor1}</p>
        <button onClick={this.offlight1}>Click Me</button>

        </div>
        {/* <div>
        <h1>{firstName2}, {lastName2}</h1>
        <p>Age: {age2}</p>
        <p>Hair Color: {hairColor2}</p>
        </div>
        <div>
        <h1>{firstName3}, {lastName3}</h1>
        <p>Age: {age3}</p>
        <p>Hair Color: {hairColor3}</p>
        </div> */}
    </div>
    );
  }
}

export default PersonCard;