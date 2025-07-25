import React from "react";
import CohortDetails from "./CohortDetails";

function App() {
  return (
    <div style={{ textAlign: "center", marginTop: "30px" }}>
      <CohortDetails
        name="React Developer Bootcamp"
        status="ongoing"
        startDate="Jan 2025"
        endDate="Apr 2025"
      />

      <CohortDetails
        name="Node.js Full Stack Training"
        status="completed"
        startDate="Aug 2024"
        endDate="Nov 2024"
      />
    </div>
  );
}

export default App;
