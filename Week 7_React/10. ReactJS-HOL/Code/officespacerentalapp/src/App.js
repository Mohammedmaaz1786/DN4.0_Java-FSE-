import React from "react";

function App() {
  const office = {
    name: "Green Valley Office",
    rent: 55000,
    address: "MG Road, Bengaluru",
  };

  const officeList = [
    { name: "Tech Park Tower", rent: 45000, address: "Whitefield, Bengaluru" },
    { name: "City Center Office", rent: 65000, address: "HSR Layout, Bengaluru" },
    { name: "Startup Hub", rent: 72000, address: "Koramangala, Bengaluru" },
  ];

  return (
    <div style={{ textAlign: "center", marginTop: "20px" }}>
      <h1>Office Space Rental App</h1>

      <img
        src="https://th.bing.com/th/id/R.1942a2b21c450a6d1ccd37efc9d16bde?rik=fyl3FOuaKD20uw&riu=http%3a%2f%2fofficesnapshots.com%2fwp-content%2fuploads%2f2016%2f01%2ffullscreen-office-design-6.jpg&ehk=2McmjZFIJLR3WgHpWIN4kGr%2byg7SXYGnwNaJEP1Q%2b4c%3d&risl=&pid=ImgRaw&r=0"
        alt="Office Space"
        style={{ borderRadius: "10px", marginBottom: "20px" }}
        width="600"
        height="300"
      />

      <h2>{office.name}</h2>
      <p>
        <strong>Rent:</strong>{" "}
        <span style={{ color: office.rent < 60000 ? "red" : "green" }}>
          ₹{office.rent}
        </span>
      </p>
      <p>
        <strong>Address:</strong> {office.address}
      </p>

      <h2>Other Office Spaces</h2>
      {officeList.map((o, index) => (
        <div
          key={index}
          style={{
            margin: "15px auto",
            width: "400px",
            padding: "10px",
            border: "1px solid black",
            borderRadius: "10px",
          }}
        >
          <h3>{o.name}</h3>
          <p>
            <strong>Rent:</strong>{" "}
            <span style={{ color: o.rent < 60000 ? "red" : "green" }}>
              ₹{o.rent}
            </span>
          </p>
          <p>
            <strong>Address:</strong> {o.address}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;
