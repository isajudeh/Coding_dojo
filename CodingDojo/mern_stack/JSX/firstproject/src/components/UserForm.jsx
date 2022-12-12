import React, { useState } from  'react';
    
    
const UserForm = (props) => {
    const [firstname, setFirstname] = useState("");
    const [lastname, setLastname] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [cpassword, setCPassword] = useState("");

    const createUser = (e) => {
        e.preventDefault();
        const newUser = { firstname, lastname, email, password, cpassword };
        console.log("Welcome", newUser);
    };
    
    return(
    <div>
        <form onSubmit={ createUser }>
            <div>
                <label>Firstname: </label> 
                <input type="text" onChange={ (e) => setFirstname(e.target.value) } value={ firstname }/>
            </div>
            <div>
                <label>Lastname: </label> 
                <input type="text" onChange={ (e) => setLastname(e.target.value) } value={ lastname }/>
            </div>
            <div>
                <label>Email: </label> 
                <input type="text" onChange={ (e) => setEmail(e.target.value) } value={ email }/>
            </div>
            <div>
                <label>Password: </label> 
                <input type="text" onChange={ (e) => setPassword(e.target.value) } value={ password }/>
            </div>
            <div>
                <label>Confirm Password: </label> 
                <input type="text" onChange={ (e) => setCPassword(e.target.value) } value={ cpassword }/>
            </div><br></br>
            <input type="submit" value="Create User" />
        </form>
        <br></br>
        Your Form Data :<br></br>
        {firstname} <br></br>
        {lastname} <br></br>
        {email} <br></br>
        {password} <br></br>
        {cpassword} <br></br>




    </div>
    );
};
    
export default UserForm;