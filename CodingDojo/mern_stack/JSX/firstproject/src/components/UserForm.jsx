import React, { useState } from  'react';

const UserForm = (props) => {
    const [firstname, setFirstname] = useState("");
    const [firstnameError, setFirstnameError] = useState("");

    const [lastname, setLastname] = useState("");
    const [lastnameError, setLastnameError] = useState("");

    const [email, setEmail] = useState("");
    const [emailError, setEmailError] = useState("");

    const [password, setPassword] = useState("");
    const [passwordError, setPasswordError] = useState("");

    const [cpassword, setCPassword] = useState("");
    const [cpasswordError, setCPasswordError] = useState("");

    const handfirstname = (e) => {
        setFirstname(e.target.value);
        if(e.target.value.length < 1) {
            setFirstnameError("FirstName is required!");
        } else if(e.target.value.length < 3) {
            setFirstnameError("FirstName must be 3 characters or longer!");
        } else {
            setFirstnameError("");
        }
    }
    const handlastname = (e) => {
        setLastname(e.target.value);
        if(e.target.value.length < 1) {
            setLastnameError("LastName is required!");
        } else if(e.target.value.length < 3) {
            setLastnameError("LastName must be 3 characters or longer!");
        } else {
            setLastnameError("");
        }
    }
    const handemail = (e) => {
        setEmail(e.target.value);
        if(e.target.value.length < 1) {
            setEmailError("Email is required!");
        } else if(e.target.value.length < 3) {
            setEmailError("Email must be 3 characters or longer!");
        } else {
            setEmailError("");
        }
    }
    const handpassword = (e) => {
        setPassword(e.target.value);
        if(e.target.value.length < 1) {
            setPasswordError("Password is required!");
        } else if(e.target.value.length < 3) {
            setPasswordError("Password must be 3 characters or longer!");
        } else {
            setPasswordError("");
        }
    }
    const handcpassword = (e) => {
        setCPassword(e.target.value);
        if(e.target.value != password) {
            setCPasswordError("Confirm Password not matched!");
        } else {
            setCPasswordError("");
        }
    }

    return (
        <form onSubmit={ (e) => e.preventDefault() }>
            <div>
                <label>First Name: </label>
                <input type="text" onChange={ handfirstname } />
                {
                    firstnameError ?
                    <p style={{color:'red'}}>{ firstnameError }</p> :
                    ''
                }
            </div>
            <div>
                <label>Last Name: </label>
                <input type="text" onChange={ handlastname } />
                {
                    lastnameError ?
                    <p style={{color:'red'}}>{ lastnameError }</p> :
                    ''
                }
            </div>
            <div>
                <label>Email: </label>
                <input type="text" onChange={ handemail } />
                {
                    emailError ?
                    <p style={{color:'red'}}>{ emailError }</p> :
                    ''
                }
            </div>
            <div>
                <label>Password: </label>
                <input type="text" onChange={ handpassword } />
                {
                    passwordError ?
                    <p style={{color:'red'}}>{ passwordError }</p> :
                    ''
                }
            </div>
            <div>
                <label>Confirm Password: </label>
                <input type="text" onChange={ handcpassword } />
                {
                    cpasswordError ?
                    <p style={{color:'red'}}>{ cpasswordError }</p> :
                    ''
                }
            </div>

            <input type="submit" value="Create User" />
        </form>
    );




    
//     const createUser = (e) => {
//         e.preventDefault();
//         const newUser = { firstname, lastname, email, password, cpassword };
//         console.log("Welcome", newUser);
//     };
    
//     return(
//     <div>
//         <form onSubmit={ createUser }>
//             <div>
//                 <label>Firstname: </label> 
//                 <input type="text" onChange={ (e) => setFirstname(e.target.value) } value={ firstname }/>
//             </div>
//             <div>
//                 <label>Lastname: </label> 
//                 <input type="text" onChange={ (e) => setLastname(e.target.value) } value={ lastname }/>
//             </div>
//             <div>
//                 <label>Email: </label> 
//                 <input type="text" onChange={ (e) => setEmail(e.target.value) } value={ email }/>
//             </div>
//             <div>
//                 <label>Password: </label> 
//                 <input type="text" onChange={ (e) => setPassword(e.target.value) } value={ password }/>
//             </div>
//             <div>
//                 <label>Confirm Password: </label> 
//                 <input type="text" onChange={ (e) => setCPassword(e.target.value) } value={ cpassword }/>
//             </div><br></br>
//             <input type="submit" value="Create User" />
//         </form>

//         <br></br>
//         Your Form Data :<br></br>
//         {firstname} <br></br>
//         {lastname} <br></br>
//         {email} <br></br>
//         {password} <br></br>
//         {cpassword} <br></br>
//     </div>
//     );

};
    
export default UserForm;