import React from "react";

function ListofPlayers() {
  const players = [
    { name: "Rohit", score: 95 },
    { name: "Kohli", score: 88 },
    { name: "Gill", score: 45 },
    { name: "Iyer", score: 67 },
    { name: "Rahul", score: 50 },
    { name: "Jadeja", score: 72 },
    { name: "Hardik", score: 60 },
    { name: "Bumrah", score: 40 },
    { name: "Shami", score: 65 },
    { name: "Siraj", score: 58 },
    { name: "Kuldeep", score: 42 },
  ];

  // Filter players with score < 70
  const lowScorers = players.filter((p) => p.score < 70);

  return (
    <div style={{ textAlign: "center", marginTop: "20px" }}>
      <h2>All Players</h2>
      {players.map((p, i) => (
        <p key={i}>
          {p.name} - {p.score}
        </p>
      ))}

      <h2>Players with Score below 70</h2>
      {lowScorers.map((p, i) => (
        <p key={i}>
          {p.name} - {p.score}
        </p>
      ))}
    </div>
  );
}

export default ListofPlayers;
