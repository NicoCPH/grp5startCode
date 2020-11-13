import React from "react";
import "./css/readMe.css";

const Readme = () => {
  const mystyle = {
    fontSize: "18px",
    font: "bold",
  }
  return (
    <>
    <h1>Min side</h1>
    <div className="div1"> 
      
      <p style={mystyle}>jeg har lavet min egen version at projektet, hvor jeg i dropdown
       menuen har lavet et link til at kunne se Holidays som bliver hentet fra et endpoint </p>
   </div>
    </>
  );
};

export default Readme;
