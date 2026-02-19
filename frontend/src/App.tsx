import React, { useState } from 'react';
import axios from 'axios';

function App() {
  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState('');

  const handleFetch = async () => {
    setLoading(true);
    setError('');
    try {
      const response = await axios.get('/players');
      setData(response.data);
    } catch (err: any) {
      setError(err.message);
    } finally {
      setLoading(false);
    }
  };

  return (
      <div style={{ padding: '20px' }}>
        <h1>Little League API Test</h1>
        <button onClick={handleFetch} disabled={loading}>
          {loading ? 'Loading...' : 'Fetch GET Data'}
        </button>
        {error && <p style={{ color: 'red' }}>Error: {error}</p>}
        {data && (
            <pre style={{ background: '#f4f4f4', padding: '10px', marginTop: '10px' }}>
          {JSON.stringify(data, null, 2)}
        </pre>
        )}
      </div>
  );
}

export default App;
