import React from 'react';

const ListOfIndianPlayers = ({ IndianPlayers }) => {
  return (
    <div>
      {IndianPlayers.map((item, index) => (
        <li key={index}>Mr. {item}</li>
      ))}
    </div>
  );
};

export default ListOfIndianPlayers;
