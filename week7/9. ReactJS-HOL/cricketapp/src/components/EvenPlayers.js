import React from 'react';

const EvenPlayers = ({ team }) => {
  const [, second, , fourth, , sixth] = team;
  return (
    <div>
      <li>Second : {second}</li>
      <li>Fourth : {fourth}</li>
      <li>Sixth : {sixth}</li>
    </div>
  );
};

export default EvenPlayers;
