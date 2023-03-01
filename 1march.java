 vector<int> updateQuery(int N,int Q,vector<vector<int>> &U)
        {
            vector<vector<int>> start(N), end(N);
            
            for(auto query : U){
                start[query[0] - 1].push_back(query[2]);
                end[query[1] - 1].push_back(query[2]);
            }
            
            vector<vector<int>> bitans(N, vector<int> (32, 0));
            
            for(int i = 0; i < N; i++){
                for(auto number : start[i]){
                    for(int j = 0; j < 32; j++)
                        bitans[i][j] += (number >> j) & 1;
                }
                
                if(i > 0){
                    for(int j = 0; j < 32; j++)
                        bitans[i][j] += bitans[i - 1][j];
                    
                    for(auto number : end[i - 1]){
                        for(int j = 0; j < 32; j++)
                            bitans[i][j] -= (number >> j) & 1;
                    }
                }
            }
            
            vector<int> ans(N);
            
            for(int i = 0; i < N; i++){
                int value = 0;
                
                for(int j = 0; j < 32; j++){
                    if(bitans[i][j] > 0)
                        value += (1 << j);
                }
                
                ans[i] = value;
            }
            
            return ans;
        }
