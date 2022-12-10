import React, { Component } from 'react';
    
    
class MyNewComponent extends Component{

    constructor (props){
        super(props);
            this.state={
                message:"ON"
            }
        }
    offlight=(e) => { 
        this.setState({message:"OFF"});
    }
    render(){
        return(
            <div>
                <hr></hr>
                Task Test children
                <hr></hr>
                <p>the light is {this.state.message}</p>
                <button onClick={this.offlight}>Click Me</button>
                <h1>
                {this.props.header}
                </h1>
                {this.props.children}
            </div>
        );
    }
}
export default MyNewComponent;

