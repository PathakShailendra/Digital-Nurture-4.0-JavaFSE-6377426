import React from 'react';
import './App.css';

function App() {
  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: "https://www.shutterstock.com/image-photo/modern-openplan-office-clean-organized-260nw-2478307893.jpg"},
    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore",
      Image: "https://st4.depositphotos.com/1009647/20125/i/450/depositphotos_201259228-stock-photo-modern-office-conference-room-interior.jpg"
    }
  ];

  return (
    <div className="App">
      <h1>Office Space , at Affordable Range</h1>

      {
        officeList.map((item, index) => {
          let colors = [];
          if (item.Rent <= 60000) {
            colors.push('textRed');
          } else {
            colors.push('textGreen');
          }

          return (
            <div key={index}>
              <img
                src={item.Image}
                width="25%"
                height="25%"
                alt="Office Space"
              />
              <h1>Name: {item.Name}</h1>
              <h3 className={colors.join(' ')}>Rent: Rs. {item.Rent}</h3>
              <h3>Address: {item.Address}</h3>
              <hr />
            </div>
          );
        })
      }
    </div>
  );
}

export default App;
