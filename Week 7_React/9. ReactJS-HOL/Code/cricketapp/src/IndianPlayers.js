import React from "react";

function IndianPlayers() {
  const T20players = ["Rohit", "Kohli", "Gill", "Iyer", "Rahul"];
  const RanjiTrophyPlayers = ["Pujara", "Rahane", "Pant", "Jadeja"];

  // Merge arrays using spread operator
  const allPlayers = [...T20players, ...RanjiTrophyPlayers];

  // Destructure Odd and Even team players
  const oddPlayers = allPlayers.filter((_, i) => i % 2 !== 0);
  const evenPlayers = allPlayers.filter((_, i) => i % 2 === 0);

  return (
    <div style={{ textAlign: "center", marginTop: "20px" }}>
      <h2>Odd Team Players</h2>
      {oddPlayers.map((p, i) => (
        <p key={i}>{p}</p>
      ))}

      <h2>Even Team Players</h2>
      {evenPlayers.map((p, i) => (
        <p key={i}>{p}</p>
      ))}

      <h2>All Players (Merged)</h2>
      {allPlayers.map((p, i) => (
        <p key={i}>{p}</p>
      ))}
    </div>
  );
}

export default IndianPlayers;
