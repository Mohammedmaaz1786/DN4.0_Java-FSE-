import React, { useState } from "react";

function CurrencyConvertor() {
  const [rupees, setRupees] = useState("");
  const [euros, setEuros] = useState("");

  const handleSubmit = () => {
    const converted = (parseFloat(rupees) / 90).toFixed(2); // Assume 1 Euro = ₹90
    setEuros(converted);
  };

  return (
    <div style={{ marginTop: "30px" }}>
      <h2>Currency Converter</h2>
      <input
        type="number"
        placeholder="Enter Rupees"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>
      {euros && <p>Converted Value: €{euros}</p>}
    </div>
  );
}

export default CurrencyConvertor;
