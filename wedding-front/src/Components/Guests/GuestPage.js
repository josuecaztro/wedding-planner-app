import React, { useState, useEffect } from 'react';
import './GuestPage.css';

function DisplayGuests() {
  const [items, setItems] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8080/api/guests')
      .then((response) => response.json())
      .then((data) => setItems(data))
      .catch((error) => console.error('Error fetching data:', error));
  }, []);

  return (
    <div id="scrollable-container">
        <h2>All Guests</h2>
      {items.map((item, index) => (
        <div key={index} className="guest-card">
          <h3>{item.firstName} {item.lastName}</h3>
          <p>#{item.phone}</p>
          <p>Reserved: {item.reserved}</p>
        </div>
      ))}
    </div>
  );
}

export default DisplayGuests;
