import React, { useEffect, useState } from "react";
import { Holidays } from "./../sites";
import Table from 'react-bootstrap/Table'

const url = Holidays;

const DailyFun = () => {
  const [holiday, setholiday] = useState([]);
  useEffect(() => {
    fetch(url)
      .then((res) => res.json())
      .then((data) => {
        setholiday(data);  
      });
  }, []);
  const ListItems = () => holiday.map((datas) => {
      return(
        <tbody key={datas.date.toString()}>
    <tr>
      <td>{datas.date}</td>
      <td>{datas.localName}</td>
      <td>{datas.name}</td>
      <td>{datas.countryCode}</td>
    </tr>
    </tbody>
  )});
  const mystyle = {
   maxWidth: "800px",
   maxHeight: "400px"
  };
  return (
    <div style={mystyle}>
      <h3>Holidays in Denmark</h3>
      <Table striped bordered hover responsive="sm" size="sm">
      <thead>
          <tr>
        <th>date</th>
        <th>localName</th>
        <th>name</th>
        <th>countryCode</th>
        </tr>
      </thead>
<ListItems/>
    </Table>
    </div>
  );
};

export default DailyFun;
