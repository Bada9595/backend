import MultiInputForm from './MultiInputForm';
import React, { useState } from 'react';

function App() {
  const [likeCount, setLikeCount] = useState(0); // React 상태 관리

  return (
    <div>
      {/* <h1>좋아요 수: {likeCount}</h1>
      <button onClick={() => setLikeCount(likeCount + 1)}>좋아요</button> */}
      <MultiInputForm/>
    </div>
  );
}

export default App;