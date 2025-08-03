import React from 'react';

const OddPlayers = ({ team }) => {
  const [first, , third, , fifth] = team;
  return (
    <div>
      <li>First : {first}</li>
      <li>Third : {third}</li>
      <li>Fifth : {fifth}</li>
    </div>
  );
};

export default OddPlayers;
