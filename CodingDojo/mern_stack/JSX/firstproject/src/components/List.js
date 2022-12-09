import React, { Component } from 'react';

class List extends Component {
  render() {
    return (
    <div>
        <h1>Hello Dojo!</h1>
        <h2>Things I need to do:</h2>
        <ul>
            <li>Learn React</li>
            <li>Climb Mt. Everest</li>
            <li>Run a Marathom</li>
            <li>Feed the cats</li>
        </ul>
    </div>
    );
  }
}

export default List;