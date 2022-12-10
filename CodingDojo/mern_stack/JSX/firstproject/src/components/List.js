import React, { Component } from 'react';

class List extends Component {
  render() {
    return (
    <div>
        <hr></hr>
        Task First JSX
        <hr></hr>
        <h1>Hello Dojo!</h1>
        <h2>Things I need to do:</h2>
        <ul>
            <li>Learn React</li>
            <li>Climb Mt. Everest</li>
            <li>Run a Marathom</li>
            <li>Feed the cats</li>
        </ul>
        <hr></hr>
        Task PersonCard
        <hr></hr>
    </div>
    );
  }
}

export default List;